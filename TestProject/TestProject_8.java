
/*
 * - 5x5 행렬 작성.
1 2 3 4 a
.
.
.
. .  .  .  a

- 이중 for문 쓰기.
- 5배수 일때는 a 를 출력하기.
 * 
 */

public class Testproject_8 {

	public static void main(String[] args) {
		int n=0;
		int i;
		int j;
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				n+=1;
				
				if(n%5==0) {
					System.out.print("a");
				}else {
					System.out.print(n+"\t");
				}
			}
			System.out.println();
		}
	}

}
