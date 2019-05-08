package cn.ghw.module;

import java.io.*;

/**
 * @Author: ghwei
 * @Date: 2019/5/8 22:52
 * @Description:
 */
public class GetTimeDemo extends GetTime {
    @Override
    protected void code() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("F:\\ksdler\\迅雷官方精简版1.5.3.288.exe"));
            bos = new BufferedOutputStream(new FileOutputStream("D:\\迅雷官方精简版1.5.3.288.exe"));
            int len = 0;
            byte [] arr = new byte[1024];
            while((len = bis.read(arr)) != -1){
                bos.write(arr,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
