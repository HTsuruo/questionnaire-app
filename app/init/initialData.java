package init;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import models.AnswerChoice;
import models.Question;
import models.questions.*;
import play.Logger;
import play.Play;
import scala.Int;
import au.com.bytecode.opencsv.CSVReader;

public class initialData {
	//private static String PANAS_FILE="panas.csv";
	//private static String WHO5_FILE="who5.csv";
	private static String QUESTION_FILE="question_list.csv";
	//private static String ANSWER_CHOICE_FILE="answer_choices_list.csv";
	private static String CCNF_DIR = "conf";
	private static String INIT_DIR = "init";
	private static char CSV_SEPARATOR = ',';
	private static char CSV_QUOTECHAR = '"';

	public static void insert() {
		try {
			//InitPanas.insert();
			//InitWho5.insert();
			InitQuestion.insert();
			//InitAnswerChoices.insert();
		} catch (Exception e) {
			Logger.warn("Initialize data failue", e);
		}
	}

	@SuppressWarnings("static-access")
	public static File getFile(String file) {
		String absolutePath = Play.application().path().getAbsolutePath();
		String filePath = absolutePath
				.concat(Play.application().path().separator).concat(CCNF_DIR)
				.concat(Play.application().path().separator).concat(INIT_DIR)
				.concat(Play.application().path().separator).concat(file);
		return new File(filePath);
	}
	
	@SuppressWarnings("static-access")
	public static CSVReader parsedLine(String file, char csv_separator,
			char csv_quote) throws FileNotFoundException,
			UnsupportedEncodingException {
		CSVReader reader = null;

		FileInputStream input = new FileInputStream(getFile(file));
		InputStreamReader inReader = new InputStreamReader(input, "SJIS");
		reader = new CSVReader(inReader, csv_separator, csv_quote, 1);
		return reader;
	}


	/*public static class InitPanas {

		public static boolean count() {
			return PanasQ.find.findRowCount() == 0 ? true : false;
		}

		public static void insert() throws IOException {
			if (count()) {
				CSVReader reader = parsedLine(PANAS_FILE, CSV_SEPARATOR,
						CSV_QUOTECHAR);
				String[] nextLine;
				while ((nextLine = reader.readNext()) != null) {
					PanasQ panas = new PanasQ();
					panas.questionId = Long.parseLong(nextLine[0]);
					panas.content = nextLine[1];
					panas.save();
				}
			}
		}
	}
	
	public static class InitWho5 {

		public static boolean count() {
			return Who5Q.find.findRowCount() == 0 ? true : false;
		}

		public static void insert() throws IOException {
			if (count()) {
				CSVReader reader = parsedLine(WHO5_FILE, CSV_SEPARATOR,
						CSV_QUOTECHAR);
				String[] nextLine;
				while ((nextLine = reader.readNext()) != null) {
					Who5Q who5 = new Who5Q();
					who5.questionId = Long.parseLong(nextLine[0]);
					who5.content = nextLine[1];
					who5.save();
				}
			}
		}
	}
	*/
	
	public static class InitQuestion {

		public static boolean count() {
			return Question.find.findRowCount() == 0 ? true : false;
		}

		public static void insert() throws IOException {
			if (count()) {
				CSVReader reader = parsedLine(QUESTION_FILE, CSV_SEPARATOR,
						CSV_QUOTECHAR);
				String[] nextLine;
				while ((nextLine = reader.readNext()) != null) {
					Question q = new Question();
					q.questionId = Long.parseLong(nextLine[0]);
					q.name = nextLine[1];
					q.qNum = Integer.parseInt(nextLine[2]);
					q.q1 = nextLine[3];
					q.q2 = nextLine[4];
					q.q3 = nextLine[5];
					q.q4 = nextLine[6];
					q.q5 = nextLine[7];
					q.q6 = nextLine[8];
					q.q7 = nextLine[9];
					q.q8 = nextLine[10];
					q.q9 = nextLine[11];
					q.q10 = nextLine[12];
					q.q11 = nextLine[13];
					q.q12 = nextLine[14];
					q.q13 = nextLine[15];
					q.q14 = nextLine[16];
					q.q15 = nextLine[17];
					q.q16 = nextLine[18];
					q.q17 = nextLine[19];
					q.q18 = nextLine[20];
					q.q19 = nextLine[21];
					q.q20 = nextLine[22];
					q.q21 = nextLine[23];
					q.q22 = nextLine[24];
					q.q23 = nextLine[25];
					q.q24 = nextLine[26];
					q.q25 = nextLine[27];
					q.q26 = nextLine[28];
					q.q27 = nextLine[29];
					q.q28 = nextLine[30];
					q.q29 = nextLine[31];
					q.q30 = nextLine[32];
					q.q31 = nextLine[33];
					q.q32 = nextLine[34];
					q.q33 = nextLine[35];
					q.q34 = nextLine[36];
					q.q35 = nextLine[37];
					
					q.save();
				}
			}
		}
	}
	
}
