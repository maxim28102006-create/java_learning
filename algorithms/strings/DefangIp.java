package strings;

// LeetCode 1108. Defanging an IP Address
// Шаблон 6 «сборка строки»: черновик → цикл → if/else с append → toString()
// Время: O(n); Память: O(n)
class DefangIp {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");                 // готовый кусок — строкой в двойных кавычках
            } else {
                sb.append(address.charAt(i));     // остальное — как есть
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new DefangIp().defangIPaddr("1.1.1.1"));      // 1[.]1[.]1[.]1
    }
}