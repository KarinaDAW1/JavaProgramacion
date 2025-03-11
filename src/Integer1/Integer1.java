package Integer1;

public class Integer1 {
	    private int value;

	    public Integer1(int value) {
	        this.value = value;
	    }
	    
	    /* ByteValue etc */
	    
	    public int intValue() {
	        return value;
	    }
	    
	    public byte byteValue() {
	    	return (byte) value;
	    }
	    
	    public double doubleValue() {
	    	return (double) value;
	    }
	    
	    public short shortValue() {
	    	return (short) value;
	    }
	    
	    public long longValue() {
	    	return (long) value;
	    }
	    
	    public float floatValue() {
	    	return (float) value;
	    }
	    
	    public Character characterValue() {
	    	return (char) value;
	    }
	    
	    /* valueOf */

	    public static Integer1 valueOf(int value) {
	        return new Integer1(value);
	    }
	    
	    /* Equals  instanceof */
	    
	    public boolean equals(Object obj) {
	        if (obj instanceof Integer1) {
	            return value == ((Integer1) obj).intValue();
	        }
	        return false;
	    }
	    
	    /* Compare */
	    public static int comapre (int a, int b) {
	    	return Integer.compare(a,b);
	    }
	    
	    /* CompareTo*/
	    
	    public int compareTo(Integer1 other) {
	        return Integer.compare(this.value, other.value);
	    }
	    
	    /* hashCode */

	    public int hashCode() {
	        return Integer.hashCode(value);
	    }
	    
	    /* toString */

	    public String toString() {
	        return Integer.toString(value);
	    }
	    
	    /* ParseInt */
	    public static int parseInt (String s) {
	    	return Integer.parseInt(s);
	    }
	    
	    /* Integer Sum */
	    public static int sum (int a, int b) {
	    	return Integer.sum(a,b);
	    }
	    
	    public static int max (int a, int b) {
	    	return Integer.max(a,b);
	    }
	    
	    public static int min (int a, int b) {
	    	return Integer.min(a,b);
	    }
	}

