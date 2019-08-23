import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import my.util.*;
public class HighScoreGame{
	public static void main(String[] args) throws Exception{
		final String FILE="score.csv";
		final int MAX=100000;
		boolean isHighScore=false;
		Common.print("⭐︎⭐︎⭐︎⭐︎乱数ゲーム⭐︎⭐︎⭐︎⭐︎");
		HighScore hs=readFile(FILE);
		int highScore;
		if(hs==null){
			Common.print("HighScore 0");
			highScore=0;
		}else{
			Common.print("HighScore "+hs);
			highScore=hs.getScore();
		}
		while(true){
			String select=Common.inputStr("やりますかyes...y no...n＞");
			if(select.equals("n")){
				Common.print("アプリを終了します");
				if(isHighScore){
					Date today=new Date();
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
					String date=sdf.format(today);
					hs=new HighScore(highScore,date);
					writeRecord(FILE,hs);
				}
				scan.close();
				break;
			}
			int no=Common.rand(MAX)+1;
			Common.print(no);
			if(no > highScore){
				highScore=no;
				isHighScore=true;
				Common.print("new Record");
			}
		}
	}
	public static HighScore readFile(String file){
		HighScore hs=null;
		BufferedReader br=null;
		try{
			FileInputStream fis=new FileInputStream(file);
			InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
			br=new BufferedReader(isr);
			String line=br.readLine();
			if(line != null && !line.equals("")){
				String[] data=line.split(",");
				hs=new HighScore(Integer.parseInt(data[0],data[1]));
			}
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (UnsupportedEncodingException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		return hs;
	}
	public static void writeRecord(String fileName,HighScore hs){
		BufferedWriter bw=null;
		try{
			FileOutputStream fos=new FileOutputStream(fileName);
			OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
			bw=new BufferedWriter(osw);
			bw.append(hs.toCSV());
				bw.flush();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (UnsupportedEncodingException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			if(bw != null){
				try{
					bw.close();
				}catch (IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
