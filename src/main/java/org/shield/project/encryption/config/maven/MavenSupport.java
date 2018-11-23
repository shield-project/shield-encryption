package org.shield.project.encryption.config.maven;

import java.util.ArrayList;
import java.util.List;

public class MavenSupport {
    public final static List<EncryptEnum> encryptEnumList = new ArrayList<>();
    static {
        encryptEnumList.add(EncryptEnum.TEXT);
    }
}
