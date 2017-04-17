package modul11;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by MYKOLA.GOROKHOV on 12.04.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        WorkWithFiles wwf = new WorkWithFiles();
        Map<String, String> map = new HashMap<>();
        map.put("1", "2");
        map.put("a", "bb");

        System.out.println("checkWord : " + wwf.checkWord("2"));

        System.out.println("replacer : \n" + wwf.replacer(map));
        System.out.println("replacer1 : \n" + wwf.replacer1(map));
        System.out.println("--fileContentReplacer------");
        wwf.fileContentReplacer(map);

        System.out.println("--fileContentMerger------");
        wwf.fileContentMerger(map);
        System.out.println("---Final-----");

    }

}
