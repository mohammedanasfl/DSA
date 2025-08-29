package challenge;

public class CompareVersion {
    public static void main(String[] args) {
        String version1="1.0.1",version2="1";
        System.out.println(compareVersion(version1,version2));
    }
    public static int compareVersion(String version1, String version2) {
        String []a=version1.split("\\.");
        String [] b=version2.split("\\.");
        int n=Math.max(a.length,b.length);

        for(int i=0;i<n;i++){
            int ver1=i<a.length?Integer.parseInt(a[i]):0;
            int ver2=i<b.length ?Integer.parseInt(b[i]):0;
            if(ver1< ver2) return -1;
            if(ver1 >ver2) return 1;
        }
        return 0;
    }
}
