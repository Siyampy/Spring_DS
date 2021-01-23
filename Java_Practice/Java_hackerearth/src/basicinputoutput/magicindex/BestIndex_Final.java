package basicinputoutput.magicindex;
import java.util.*;
    import java.io.*;
     
    public class BestIndex_Final {
    	public static PrintWriter w = new PrintWriter(System.out);
    	public static void main(String args[] ) throws Exception 
    	{
    		Reader in = new Reader();
    		int n = in.nextInt();
    		long[][] arr = new long[n][2];
    		arr[0][0] = in.nextLong();
    		arr[0][1] = arr[0][0];
    		for (int i=1; i<n; i++) {
    			arr[i][0] = in.nextLong();
    			arr[i][1] = arr[i-1][1] + arr[i][0]; 
    		}
    		Long bse = Long.MIN_VALUE;
    		for (int i=0; i<n; i++) {
    			int l = (arr.length - i);
    			int x = (int)Math.floor((-1.0 + Math.sqrt(1 + 8*l))/2);
    			Long se = arr[i+ (x*(x+1))/2 -1][1] - arr[i][1] + arr[i][0];
    			if(se > bse)
    				bse = se;
    		}
    		w.println(bse);
    		w.flush();
    		return;
    	}
    }
     
    class Reader {
    	final private int BUFFER_SIZE = 1 << 16;
    	private DataInputStream din;
    	private byte[] buffer;
    	private int bufferPointer, bytesRead;
     
    	public Reader() {
    		din = new DataInputStream(System.in);
    		buffer = new byte[BUFFER_SIZE];
    		bufferPointer = bytesRead = 0;
    	}
    	public String nextLine() throws IOException {
    		int c = read();
    		while(isSpaceChar(c))
    			c = read();
    		StringBuilder res = new StringBuilder();
    		do {
    			res.appendCodePoint(c);
    			c = read();
    		} while(!isEndOfLine(c));
    		return res.toString();
    	}
    	public String next() throws IOException {
    		int c = read();
    		while(isSpaceChar(c))
    			c = read();
    		StringBuilder res = new StringBuilder();
    		do {
    			res.appendCodePoint(c);
    			c = read();
    		} while(!isSpaceChar(c));
    		return res.toString();
    	}
    	public int nextInt() throws IOException {
    		int ret = 0;
    		byte c = read();
    		while(c <= ' ')
    			c = read();
    		boolean neg = (c == '-');
    		if(neg)
    			c = read();
    		do {
    			ret = ret * 10 + c - '0';
    		} while((c = read()) >= '0' && c <= '9');
    		if (neg)
    			return -ret;
    		return ret;
    	}
    	public int[] nextIntArray(int n) throws IOException {
    		int a[] = new int[n];
    		for(int i = 0; i < n; i++)
    			a[i] = nextInt();
    		return a;
    	}
    	public int[][] next2dIntArray(int n, int m) throws IOException {
    		int a[][] = new int[n][m];
    		for(int i = 0; i < n; i++)
    			for(int j = 0; j < m; j++)
    				a[i][j] = nextInt();
    		return a;
    	}
    	public char nextChar() throws IOException {
    		return next().charAt(0);
    	}
    	public long nextLong() throws IOException {
    		long ret = 0;
    		byte c = read();
    		while(c <= ' ')
    			c = read();
    		boolean neg = (c == '-');
    		if(neg)
    			c = read();
    		do {
    			ret = ret * 10 + c - '0';
    		} while((c = read()) >= '0' && c <= '9');
    		if (neg)
    			return -ret;
    		return ret;
    	}
    	public double nextDouble() throws IOException {
    		double ret = 0, div = 1;
    		byte c = read();
    		while(c <= ' ')
    			c = read();
    		boolean neg = (c == '-');
    		if(neg)
    			c = read();
    		do {
    			ret = ret * 10 + c - '0';
    		} while((c = read()) >= '0' && c <= '9');
    		if (c == '.') {
    			while((c = read()) >= '0' && c <= '9') {
    				ret += (c - '0') / (div *= 10);
    			}
    		}
    		if(neg)
    			return -ret;
    		return ret;
    	}
    	private void fillBuffer() throws IOException {
    		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
    		if(bytesRead == -1)
    			buffer[0] = -1;
    	}
    	private byte read() throws IOException {
    		if(bufferPointer == bytesRead)
    			fillBuffer();
    		return buffer[bufferPointer++];
    	}
    	public void close() throws IOException {
    		if(din == null)
    			return;
    		din.close();
    	}
    	public boolean isSpaceChar(int c) {
    		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    	}
    	private boolean isEndOfLine(int c) {
    		return c == '\n' || c == '\r' || c == -1;
    	}
    }