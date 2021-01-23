package fastio;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
class Reader
{
	final private int BUFFER_SIZE = 1 << 16;
	private DataInputStream din;
	private byte[] buffer;
	private int bufferPointer, bytesRead;
	public Reader() {
		din = new DataInputStream(System.in);
		buffer = new byte[BUFFER_SIZE];
		bufferPointer = bytesRead = 0;
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
	private byte read() throws IOException {
		if(bufferPointer == bytesRead)
			fillBuffer();
		return buffer[bufferPointer++];
	}
	private void fillBuffer() throws IOException {
		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
		if(bytesRead == -1)
			buffer[0] = -1;
	}
	
}
public class FastReading_1 {
public static void main(String[] args) {
//	PrintWriter pw= new PrintWriter(System.out);
	Scanner sc= new Scanner(System.in);
	DataInputStream din=new  DataInputStream(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	long start = System.currentTimeMillis();
	Long l=sc.nextLong();
	long stop = System.currentTimeMillis();
	
	System.out.println("Time taken: "+ (stop-start)*100);
	
	
}
}
