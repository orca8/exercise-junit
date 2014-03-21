package orca8;

/**
 * exercise-junit
 */
public class Counter {
    int count = 0;

    /**
     * インクリメントした数値を返します
     *
     * @return インクリメントした値
     */
    public int increment() {
        return ++count;
    }
}
