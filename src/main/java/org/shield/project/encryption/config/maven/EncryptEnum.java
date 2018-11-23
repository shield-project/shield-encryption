package org.shield.project.encryption.config.maven;

import lombok.Getter;

@Getter
public enum EncryptEnum {
    TEXT(0, "TEXT(", ")");
    private int value;
    private String prefix;
    private String suffix;

    EncryptEnum(int value, String prefix, String suffix) {
        this.value = value;
        this.prefix = prefix;
        this.suffix = suffix;
    }
}
