class Date {
  int day;
  int month;
  int year;
   
  Date(int day, int month, int year) {
    assert month > 0;
    assert month < 13;
    assert day > 0;
    assert day < 32;
   
    this.day = day;
    this.month = month;
    this.year = year;
  }
   
  Date nextDay() {
    if (month == 12 && day == 31)
      return new Date(1, 1, year + 1);
    if (day==daysInMonth())
      return new Date(1,month+1,year);
    return new Date(day + 1, month, year);
  }
   
  int daysInMonth() {
    if (month == 2)
      return isLeapYear() ? 29 : 28;
    switch (month) {
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      default:
        return 31;
    }
  }
   
  String monthAsHTML() {
    String result = "<table><tr><th>Mo</th><th>Di</th><th>Mi</th>"
        +"<th>Do</th><th>Fr</th><th>Sb</th><th>So</th></tr>";
    int wd = new Date(1, month, year).dayOfWeek();
    if (wd == 0)
      wd = 7;
    if (wd>=1)result=result+"<tr>";
    for (int i = 1; i < wd; i++) {
      result += "<td></td>";
    }
    int tds  = wd-1;
    for (int i=1;i<=daysInMonth();i++){
      if (tds%7==0&&tds>0) result += "</tr><tr>";
      result+="<td>"+i+"</td>";
      tds++;
    }
    result += "</tr>";
    return result + "</table>";
  }
   
  Date mothersDay() {
    int wd = new Date(1, 5, year).dayOfWeek();
    return new Date(wd == 0 ? 8 : (15 - wd), 5, year);
  }
   
  int dayOfWeek() {
    // Schrittweise Lösung über die Einzelziffern
   
    int tz = day % 7;
    int[] monatsziffern = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    int mz = monatsziffern[month - 1];
    int jz = year % 100;
    int jahresziffer = (jz + jz / 4) % 7;
    int jh = year / 100;
    int jahrhundertziffer = (3 - jh % 4) * 2;
    int schaltjahreskorrektur
        = (isEarlierThan(new Date(1, 3, year)) && isLeapYear()) ? 6 : 0;
    return (tz + mz + jahresziffer + jahrhundertziffer
        + schaltjahreskorrektur) % 7;
    // Lösung mit Einsetzen direkt in die Formel
    // int y = (month < 3) ? (year - 1) : year;
    // return (day + (26 * ((month + 9) % 12 + 1) - 2) / 10 + y % 100 + (y % 100
    // / 4) + (y / 400) - 2 * (y / 100)) % 7;
  }
   
  boolean isEarlierThan(Date that) {
    return year < that.year || (year == that.year && month < that.month)
        || (year == that.year && month == that.month && day < that.day);
  }
  boolean isLaterThan(Date that) {
    return that.isEarlierThan(this);
  }
   
  boolean isSameDate(Date that) {
    return year == that.year && month == that.month && day == that.day;
  }
   
  public String toString() {
    String[] wds = {"So", "Mo", "Di", "Mi", "Do", "Fr", "Sb"};
    return wds[dayOfWeek()] + " " + day + "." + month + "." + year;
  }
   
  boolean isLeapYear() {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }
   
  int getAbsoluteDaysInYear() {
    return isLeapYear() ? 366 : 365;
  }
   
  public static void main(String[] args) {
    Date d = new Date(30, 11, 2018);
    System.out.println(d);
    System.out.println(d.mothersDay());
    d = new Date(1, 5, 1979);
    System.out.println(d);
    System.out.println(d.mothersDay());
    d = new Date(1, 5, 1980);
    System.out.println(d);
    System.out.println(d.mothersDay());
    d = new Date(1, 5, 1981);
    System.out.println(d);
    System.out.println(d.mothersDay());
    d = new Date(1, 5, 1982);
    System.out.println(d);
    System.out.println(d.mothersDay());
    d = new Date(1, 5, 1983);
    System.out.println(d);
    System.out.println(d.mothersDay());
    d = new Date(1, 5, 1984);
    System.out.println(d);
    System.out.println(d.mothersDay());
    d = new Date(1, 5, 1985);
    System.out.println(d);
    System.out.println(d.mothersDay());
    d = new Date(1, 5, 1986);
    System.out.println(d);
    System.out.println(d.mothersDay());
    d = new Date(1, 11, 2017);
    System.out.println(d);
    System.out.println(d.mothersDay());
    System.out.println(d.monthAsHTML());
  }
}