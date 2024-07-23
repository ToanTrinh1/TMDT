package com.example.tmdt_project.Model.MD5;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5encriptor {
    public String encript(String txt) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        //      txt ket qua
        String enrTxt;
        //       thư viện md5
        MessageDigest msd = MessageDigest.getInstance("MD5");
        //      chuyển chuổi truyền vào sang dạng byte
        byte[] txtBytes = txt.getBytes(StandardCharsets.UTF_8);
        byte[] entTxtBytes = msd.digest(txtBytes);
        //      ép kiểu chuổi byte trên về String để lưu
        BigInteger bigInt = new BigInteger(1, entTxtBytes);
        enrTxt= bigInt.toString();
        //       trả về chuổi md5 đã mã hóa
        return enrTxt;
    }

}
