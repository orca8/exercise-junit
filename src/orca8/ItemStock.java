package orca8;

import java.util.HashMap;
import java.util.Map;

/**
 * exercise-junit
 */
public class ItemStock {

    private final Map<String, Integer> values = new HashMap<String, Integer>();

    /**
     * Itemオブジェクトを追加します
     *
     * @param item
     */
    public void add(Item item) {
        Integer num = values.get(item.name);
        if (num == null) {
            num = 0;
        }
        num++;
        values.put(item.name, num);
    }

    /**
     * 指定したItemオブジェクトの数量を返します
     * 指定したItemオブジェクトが登録されていない場合は0を返します
     *
     * @param item
     * @return
     */
    public int getNum(Item item) {
        Integer num = values.get(item.name);
        return num != null ? num : 0;
    }
}
