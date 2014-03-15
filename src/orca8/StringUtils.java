package orca8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * exercise-junit
 */
public class StringUtils {

    /**
     * textをスネークケースに変換します
     *
     * @param text
     * @return スネークケースに変換した文字列
     */
    public static String toSnakeCase(String text) {
        String snake = text;
        Pattern p = Pattern.compile("([A-Z])");
        for (; ; ) {
            Matcher m = p.matcher(snake);
            if (!m.find()) break;
            snake = m.replaceFirst("_" + m.group(1).toLowerCase());
        }
        return snake.replaceFirst("^_", "");
    }

}
