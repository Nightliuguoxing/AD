import java.io.*;

public class ReadFileUtil {

    // 读取存放测试数据的文件
    public int[] ReadArrayDoc(String path) {
        // 设置一个空数组用于存放测试数据
        int[] nums = {};
        // 设置读取文件的地址
        try {
            FileReader reader = new FileReader(path);
            BufferedReader br = new BufferedReader(reader);
            String readLine = "", bf = "";
            while ((readLine = br.readLine()) != null) {
                bf = readLine.trim();
            }
            String[] str = bf.split(" ");
            nums = new int[str.length];
            for(int i = 0; i < str.length; i++){
                nums[i] = Integer.parseInt(str[i]);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        // 返回测试数组
        return nums; 
    }
}