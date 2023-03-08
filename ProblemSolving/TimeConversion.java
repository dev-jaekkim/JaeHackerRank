public class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public String timeConversion(String s) {
        // Write your code here

        //마지막 두 숮자 확인.
        // 만약 A라면 그대로 리턴
        // 만약 B라면 앞에 두 숫자에 12를 더하고 합쳐서 리턴

        s.replaceAll("//s+","");
        String minuteSecond = s.substring(2,s.length() -2);
        if (s.contains("A")){
            if ("12".equals(s.substring(0,2))){
               return "00".concat(minuteSecond);
            }
            return s.substring(0,s.length() -2);
        } else {
            Integer hour = Integer.parseInt(s.substring(0,2));
            hour = hour + 12;

            String hourString = String.valueOf(hour);

            if("24".equals(hourString)) {
                hourString = "12";
            }
            return hourString.concat(minuteSecond);
        }
    }

}
