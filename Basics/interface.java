class Student
{
    private int rollno;
    private String name;
    private String address;
    public void storeDetails(int rno, String sname, String sadd)
    {
        rollno = rno;
        name = sname;
        address = sadd;
    }
    public void showDetails()
    {
        System.out.println("ROll No :: " + rollno);
        System.out.println("Name :: " + name);
        System.out.println("Address :: " + address);
    }
}
class Test extends Student
{
    protected int marksSubjectl;
    protected int marksSubject2;
    protected int marksSubject3;
    protected int marksSubject4;
    public void storeMarks(int ml, int m2, int m3, int m4)
    {
        marksSubjectl = ml;
        marksSubject2 = m2;
        marksSubject3 = m3;
        marksSubject4 = m4;
    }
    public void showMarks()
    {
        System.out.println("Marks of Subjectl :: " + marksSubjectl);
        System.out.println("Marks of Subject2 :: " + marksSubject2);
        System.out.println("Marks of Subject3 :: " + marksSubject3);
        System.out.println("Marks of Subject4 :: " + marksSubject4);
    }
}
class Result extends Test
{
    private int totalMarks;
    private float percentage;
    private char grade;
    public void evaluateResult()
    {
        totalMarks = marksSubjectl + marksSubject2 + marksSubject3 + marksSubject4;
        percentage = (totalMarks * 100.00F / 600.00F);
        if (percentage >= 50.00F)
            grade = 'D';
        else
        if (percentage >= 55.00F && percentage <= 60.00F)
            grade = 'C';
        else
        if (percentage >= 61.00F && percentage <= 70.00F)
            grade = 'B';
        else
        if (percentage >= 71.00F && percentage <= 75.00F)
            grade = 'A';
        else
        if (percentage >= 76.00F && percentage <= 85.00F)
            grade = 'H';
        else
            grade = 'S';
    }
    public void showResult()
    {
        showDetails();
        showMarks();
        System.out.println("Total Marks :: " + totalMarks);
        System.out.println("percentage :: " + percentage);
        System.out.println("Grade :: " + grade);
    }
}
