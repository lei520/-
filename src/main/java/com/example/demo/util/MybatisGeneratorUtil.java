package com.example.demo.util;

import org.mybatis.generator.api.ShellRunner;

public class MybatisGeneratorUtil {

    public static void main(String[] args) throws Exception {
        args = new String[] { "-configfile", "src/main/resources/dao-generate-config.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
