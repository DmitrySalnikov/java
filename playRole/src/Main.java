public class Main {
    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };
        String[][] a = new String[roles.length][textLines.length];
        int[] idx = new int[roles.length];
        int[][] num  = new int[roles.length][textLines.length];
        for (int i = 0; i < textLines.length; ++i) {
            int j = 0;
            label:
            for (; j < roles.length; ++j) {
                for (int k = 0; k < roles[j].length(); ++k) {
                    if (textLines[i].charAt(k) != roles[j].charAt(k))
                        continue label;
                }
                a[j][idx[j]] = textLines[i].substring(roles[j].length() + 2);
                num[j][idx[j]] = i + 1;
                ++idx[j];
                break;
            }
        }
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < roles.length; ++i) {
            res.append(roles[i] + ":\n");
            for (int j = 0; j < idx[i]; ++j) {
                res.append(num[i][j] + ") " + a[i][j] + '\n');
            }
            res.append('\n');
        }
        String s = String.valueOf(res);
        System.out.println(res);
    }
}