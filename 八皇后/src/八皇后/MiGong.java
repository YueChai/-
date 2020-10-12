package 八皇后;

public class MiGong {
	
	public static void main(String[] args) {
		int map[][]=new int[8][7];
		//用1表示墙，把上下置为1
		for (int i = 0; i < 7; i++) {
			map[0][i]=1;
			map[7][i]=1;
		}
		//把左右置为1
		for (int i = 0; i < 8; i++) {
			map[i][0]=1;
			map[i][6]=1;
		}
		//再添加一个挡板
		map[3][1]=1;
		map[3][2]=1;
		//遍历输出一下数组
		System.out.println("地图的情况~~");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.printf("%d\t",map[i][j]);
			}
			System.out.println();
			
		}
		setway(map, 1, 3);
		//输出走过后的路线
		System.out.println("走过后的地图的情况~~");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.printf("%d\t",map[i][j]);
			}
			System.out.println();
			
		}
		
		
	}
	/**
	 * @param map[][] 表示地图
	 * @param i 表示从地图的哪个位置开始找
	 * @param j
	 * @param return 找到就返回true，否则就返回flase
	 */
	//若小球能到达map【6】【5】则说明通路被找到了
	//当map【i】【j】=0表示还为走过该位置,为1表示为墙，为2表示为通路可以走,3表示已经走过但走不通
	//制定行走策略为 下右上左,若走不通则回溯
	public static boolean setway(int map[][],int i,int j){
		if(map[6][5]==2) {
			return true;
		}else {
			if(map[i][j]==0) {
				map[i][j]=2;
				if(setway(map,i+1,j)) {
					return true;
				}else if(setway(map,i,j+1)){
					return true;
				}else if(setway(map, i-1, j)) {
					return true;
				}else if(setway(map, i, j-1)) {
					return true;
				}else {
					map[i][j]=3;
					return false;
				}
			}else {
				return false;
		}
		}
	
	}
}
