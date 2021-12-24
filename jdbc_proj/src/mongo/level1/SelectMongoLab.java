package mongo.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;

public class SelectMongoLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
		mongoLogger.setLevel(Level.SEVERE);
		try {
			MongoClient mongoClient = new MongoClient("localhost", 27017);
			MongoDatabase db = mongoClient.getDatabase("edudb");
			MongoCollection<Document> collection = db.getCollection("avengers");
			MongoCursor<Document>  cursor = collection.find().iterator();
//			Bson obj = Projections.fields(Projections.include("name","age","book"));
//			MongoCursor<Document>  newCursor = collection.find().projection(obj).iterator();
			// 알아두면 상당히 유용한 메서드
//			
            while(cursor.hasNext()) {
            	Document doc = cursor.next();
            	System.out.printf("%s 팀원의 나이는 %.0f입니다.%n",doc.get("name"), doc.get("age")); 
            	ArrayList<Document> bookList =(ArrayList<Document>) doc.get("book");
            	System.out.println("[좋아하는 책 리스트]");
    	
            	for(Document book : bookList) {
            		System.out.println("책제목 : " + book.get("bookName"));
            		System.out.println("출판사 : " + book.get("publisher"));
            		System.out.println("장르 : " + book.get("genre"));
            	}
            	System.out.println("----------------------------------------");
            	}
			}
		catch (Exception exception) {
			System.err.println(exception.getClass().getName() + ": " + exception.getMessage());
		}
}
}
