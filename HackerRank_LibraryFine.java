package coreJavaPrograms;

public class HackerRank_LibraryFine {

	public static void main(String[] args) {

		int d1=2, m1=7, y1=1014, d2=1,m2=1,y2=1015;
		int result=0;
		result = libraryFine(d1, m1, y1, d2, m2, y2);
		System.out.println(result);
	}
	
	
public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
	int result=0;
	if((d1<=d2 && m1<=m2 && y1<=y2)) {
		result = 0;
	}else if(d1>d2 && y1<y2 || m1<m2 &&y1==y2 || d1>d2 &&y1<y2 ) {
		result = 0;
	}
	else if(Math.abs(y1-y2)>0) {
		result = 10000;
	}else if(Math.abs(m1-m2)>0 && y1==y2) {
		result = 500 * Math.abs(m1-m2);
	}else if(Math.abs(d1-d2)>0 && m1==m2 &&y1==y2) {
		result = 15 * Math.abs(d1-d2);
	}
	return result;
}
}
