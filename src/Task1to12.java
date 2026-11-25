import java.util.Scanner;
public class Task1to12 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        int[][] empty = new int[3][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int max = a[0][0];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                if(a[i][j] > max)
                    max = a[i][j];
            }
        }
        System.out.println("Max: " + max);

        System.out.println();


        //Practice2
        int[][] b = {{5, 10, 15}, {20, 25, 30}};
        System.out.println(b[1][2]);
        b[0][1] = 99;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        //3 and 4
        int sum = 0;
        int odd = 0;
        int even = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                sum += b[i][j];
                if(b[i][j] % 2 == 0)
                    even += 1;
                else
                    odd += 1;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        //5
        System.out.println();
        int[][] c = {{5, 10, 15, 45}, {20, 25, 30, 99}, {-1, 0, 69, 19}};
        int cMax = c[0][0];
        int cMin = c[0][0];
        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
                if(c[i][j] > cMax)
                    cMax = c[i][j];
                else if (c[i][j] < cMin)
                    cMin = c[i][j];
            }
            System.out.println();
        }
        System.out.println("Max: " + cMax);
        System.out.println("Min: " + cMin);

        //6
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int[][] d = new int[2][3];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

        //7
        int[][] e = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        for (int i = 0; i < e.length; i++) {
            int columnSum = 0;
            for (int j = 0; j < e[i].length; j++) {
                columnSum += e[j][i];
            }
            System.out.println("Sum of column " + (i+1) + ": " + columnSum);
        }

        //8
        int[][] f = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        System.out.print("Enter a number: ");
        int fnum = scanner.nextInt();
        int fcount = 0;
        for(int i = 0; i < f.length; i++) {
            for(int j = 0; j < f[i].length; j++) {
                if (f[i][j] > fnum) {
                    fcount += 1;
                }
            }
        }
        System.out.println(fcount + " numbers are greater than " + fnum);


        //9
        int[][] g = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int gtarget = 4;
        boolean gfound = false;
        for(int i = 0; i < g.length; i++) {
            for(int j = 0; j < g[i].length; j++) {
                if(gtarget == g[i][j]) {
                    System.out.println(gtarget + " is found at " + i + " row " + j + " column");
                    gfound = true;
                    return;
                }
            }
        }
        if(!gfound) {
            System.out.println(gtarget + "is not found");
        }

        //10
        int[][] h = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        int hsum = 0;
        for(int i = 0; i < h.length; i++) {
            System.out.print(h[i][i] + " ");
            hsum += h[i][i];
            if(i != h.length-1)
                System.out.print("+ ");
        }
        System.out.print("= " + hsum + "\n");

        //11
        int[][] k = {
                { -5,  12,  -3 },
                {  8,  -1,   4 },
                { -9,   7, -15 }};
        System.out.println("Before:");
        for(int i = 0; i < k.length; i++) {
            for(int j = 0; j < k[i].length; j++) {
                System.out.print(k[i][j] + " ");
                if(k[i][j] < 0)
                    k[i][j] = 0;
            }
            System.out.println();
        }
        System.out.println("After: ");
        for(int i = 0; i < k.length; i++) {
            for(int j = 0; j < k[i].length; j++) {
                System.out.print(k[i][j] + " ");
            }
            System.out.println();
        }
        //12
        int[][] scores = {
                { 85, 90, 78, 92 }, // Student 1
                { 70, 88, 95, 80 }, // Student 2
                { 91, 84, 89, 96 }  // Student 3
        };
        double maxScore = 0.0d;
        double total = 0.0d;
        for(int i = 0; i < scores.length; i++) {
            double totalStudent = 0.0d;
            for(int j = 0; j < scores[i].length; j++) {
                totalStudent += scores[i][j];
                if(scores[i][j] < maxScore)
                    maxScore = scores[i][j];
            }
            double averageStudent = totalStudent/scores[i].length;
            total += averageStudent;
            System.out.println("Student " + (i+1) + " average: " + averageStudent);
        }
        System.out.println("Max score: " + maxScore);
        System.out.println("Total average: " + total/ scores.length);
    }
}
