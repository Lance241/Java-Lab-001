public class HelloXwing {
    /**
     * Returns a String containing a X-Wing ASCII-Art
     *
     * @return Ascii-Art String of an X-Wing
     *
     * Name: Steven Fraga Date: Thursday, August 24
     */
    static String xwing() {
        return """
                           __
                .-.__      \\ .-.  ___  __
                |_|  '--.-.-(   \\/\\;;\\_\\.-._______.-.
                (-)___     \\ \\ .-\\ \\;;\\(   \\       \\ \\
                 Y    '---._\\_((Q)) \\;;\\\\ .-\\     __(_)
                 I           __'-' / .--.((Q))---'    \\,
                 I     ___.-:    \\|  |   \\'-'_          \\
                 A  .-'      \\ .-.\\   \\   \\ \\ '--.__     '\\
                 |  |____.----((Q))\\   \\__|--\\_      \\     '
                    ( )        '-'  \\_  :  \\-' '--.___\\
                     Y                \\  \\  \\       \\(_)
                     I                 \\  \\  \\         \\,
                     I                  \\  \\  \\          \\
                     A                   \\  \\  \\          '\\
                     |                    \\  \\__|           '
                                           \\_:.  \\
                                             \\ \\  \\
                                              \\ \\  \\
                                               \\_\\_|""";
    }

    public static void main(String[] args) {
        System.out.println(xwing());
        //hello world//
    }
}
