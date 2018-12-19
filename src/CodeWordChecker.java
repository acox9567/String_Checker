//Alexander Cox
//Wednesday, December 19, 2018

public class CodeWordChecker implements StringChecker {

    private int min;
    private int max;
    private String query;

    public CodeWordChecker (int min, int max, String query)
    {
        this.min = min;
        this.max = max;
        this.query = query;
    }

    public CodeWordChecker (String query)
    {
        this.min = 6;
        this.max = 20;
        this.query = query;
    }

    public boolean isValid(String str)
    {
        return str.length() >= min && str.length() <= max && !str.contains(query);
    }
}
