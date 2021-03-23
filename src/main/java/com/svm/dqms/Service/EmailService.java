/*
 * package com.svm.dqms.Service;
 * 
 * import java.io.IOException; import java.nio.file.Files; import
 * java.nio.file.Path; import java.nio.file.Paths;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.svm.dqms.Dao.HierarchyDao;
 * 
 * @Service public class EmailService {
 * 
 * @Autowired HierarchyDao emaildao;
 * 
 * public Object readEmailService() { String host = "smtp.office365.com"; String
 * port = "587"; String userName = "dqms@solverminds.com"; String password =
 * "Voh41557@123"; // Creating a folder in c // Path path =
 * Paths.get("/home/dqmsuser/email_docs"); // try { //
 * Files.createDirectories(path); // } catch (IOException e) { // // TODO
 * Auto-generated catch block // e.printStackTrace(); // } //
 * System.out.println("created"); String saveDirectory =
 * "/home/dqmsuser/email_docs"; // String saveDirectory = "E:\\Attachment";
 * //return emaildao.readEmailDao(host, port, userName, password,
 * saveDirectory); }
 * 
 * }
 */