package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


// 動作確認用クラス

public class Main {
  public static void main(String[] args) {
    if (isBlanck(args)) {
      System.out.println("決めた数字と、予測した数字を引数に入力してください。¥n 例）123 456");
      System.exit(0);
    }

    if (!checkInput(args[0]) || !checkInput(args[1])) {
      System.out.println("ひとつのパラメータは数字３桁です。");
      System.exit(0);
    }

    System.out.println(new OutputMapping().getResultStatement(new Numer0nArugolism().analyze(
        args[0], args[1])));
  }

  public static boolean isBlanck(String[] args) {
    return (args.length == 2);
  }

  public static boolean checkInput(String arg) {
    Matcher matcher = Pattern.compile("^[0-9]{3}$").matcher(arg);
    return (matcher.find());
  }
}
