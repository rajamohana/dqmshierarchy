package com.svm.dqms.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilityService {
	static Log L = new Log();

	public static List<String> getHeatChartChannelNames(Session session) {
		List<String> getChannelNames = new LinkedList<>();
		try {
			// get channelnames
			String getChannels_hql = "select ChannelName from AccuracyThreshold where channelname in('ch_26', 'ch_40195', 'ch_40281', 'ch_40165', 'ch_5', "
					+ " 'ch_40271', 'ch_21', 'ch_40973', 'ch_40974', 'ch_1047', 'ch_3','ch_103', 'ch_1', 'ch_12', 'ch_2')";
			Query getChannelQuery = session.createSQLQuery(getChannels_hql);
			List<String> getChannelData = getChannelQuery.list();
			session.flush();
			session.clear();

			for (String data : getChannelData) {
				getChannelNames.add(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return getChannelNames;
	}

	public static List<LinkedHashMap<String, String>> getHeatChartChannelRange(Session session) {
		// get accuracy threshhold range
		String getllimit_hql = "select Id,ChannelName,MinLimit,MaxLimit,Description from AccuracyThreshold "
				+ " where channelname in('ch_26', 'ch_40195', 'ch_40281', 'ch_40165', 'ch_5', 'ch_40271', 'ch_21', 'ch_40973',"
				+ " 'ch_40974', 'ch_1047', 'ch_3','ch_103', 'ch_1', 'ch_12', 'ch_2');";
		Query getlimitQuery = session.createSQLQuery(getllimit_hql);
		List<Object[]> getlimitData = getlimitQuery.list();
		session.flush();
		session.clear();

		LinkedHashMap<String, String> hm_getlimitData = null;
		List<LinkedHashMap<String, String>> hm_getlimitList = new ArrayList<>();
		for (Object[] data : getlimitData) {
			hm_getlimitData = new LinkedHashMap<>();
			hm_getlimitData.put("id", data[0].toString());
			hm_getlimitData.put("channelname", data[1].toString());
			hm_getlimitData.put("minlimit", String.valueOf(Double.parseDouble(data[2].toString())));
			hm_getlimitData.put("maxlimit", String.valueOf((Double.parseDouble(data[3].toString()))));
			hm_getlimitData.put("description", data[4].toString());
			hm_getlimitList.add(hm_getlimitData);
		}
		return hm_getlimitList;
	}

	public static String getMonth(String month) {
		String monthString;
		switch (month) {
		case "01":
			monthString = "Jan";
			break;
		case "02":
			monthString = "Feb";
			break;
		case "03":
			monthString = "Mar";
			break;
		case "04":
			monthString = "Apr";
			break;
		case "05":
			monthString = "May";
			break;
		case "06":
			monthString = "Jun";
			break;
		case "07":
			monthString = "Jul";
			break;
		case "08":
			monthString = "Aug";
			break;
		case "09":
			monthString = "Sep";
			break;
		case "10":
			monthString = "Oct";
			break;
		case "11":
			monthString = "Nov";
			break;
		case "12":
			monthString = "Dec";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
		return monthString;
	}

	public static String getchannelnamelist(String name) {
		String nameString;
		switch (name) {
		case "me_shaft_revolution_instant":
			nameString = "ch_40281";
			break;
		case "me_load_average":
			nameString = "ch_26";
			break;
		case "me_no1_cyl_exh_gas_out_t":
			nameString = "ch_40195";
			break;
		case "me_scav_air_in_p":
			nameString = "ch_40271";
			break;
		case "eca":
			nameString = "ch_526";
			break;
		case "s_b_area_maneuvering_area":
			nameString = "ch_21051";
			break;
		case "no_1_main_air_reservoir_p":
			nameString = "ch_40973";
			break;
		case "no_2_main_air_reservoir_p":
			nameString = "ch_40974";
			break;
		case "hfo_settling_tank_level":
			nameString = "ch_1047";
			break;
		case "lat_start":
			nameString = "ch_40";
			break;
		case "relative_wind":
			nameString = "ch_5";
			break;
		case "relative_wind_direction":
			nameString = "ch_4";
			break;
		default:
			nameString = "Invalid name";
			break;
		}
		return nameString;
	}

}
