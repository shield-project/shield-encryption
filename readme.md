#   加密解密工具

shield-encryption利用开源第三方jasypt加密解密。

>使用教程

+ 编辑encrypted.properties文件
   
    	secret-key=password
+ 利用EncryptUtil.TextEncryptor实例对明文进行加密,加密后密码格式为 <font color=#0099ff >" tvUjtftYxgdum5SkIE/Z2bD/2mHLkEHDO"</font>
	你需要注意密文前面的看似空格的东西，那是加密校验码，切记不可删除，否则导致无法解密。