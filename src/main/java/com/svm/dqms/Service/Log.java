package com.svm.dqms.Service;

import org.springframework.stereotype.Service;

@Service
public class Log {

    public void I(String Info_msg) {
        //Info
        System.out.println(Info_msg);
    }

    public void W(String Warn_msg) {
        //warn
        System.out.println(Warn_msg);
    }

    public void E(String Error_msg) {
        //error
        System.out.println(Error_msg);
    }

    public void F(String Fatal_msg) {
        //fatal
        System.out.println(Fatal_msg);
    }

    public void sout(String info_msg) {

        //info
        System.out.println(info_msg);
    }
}
