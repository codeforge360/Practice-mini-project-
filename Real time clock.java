import java.time.LocalTime;

class Test {
    public static void main(String[] args) throws Exception {

        while (true) {
            LocalTime time = LocalTime.now();

            int hour = time.getHour();      // 0–23
            int minute = time.getMinute();
            int second = time.getSecond();

            String ampm;

            if (hour >= 12) {
                ampm = "PM";
            } else {
                ampm = "AM";
            }

            // 24 → 12 hour conversion
            if (hour == 0) {
                hour = 12;
            } else if (hour > 12) {
                hour = hour - 12;
            }

            System.out.println(hour + ":" + minute + ":" + second + " " + ampm);

            Thread.sleep(1000);
        }
    }
}
