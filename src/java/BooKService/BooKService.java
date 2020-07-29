/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BooKService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author Animesh Chaturvedi (animesh.chaturvedi88@gmail.com)
 */
@WebService()
public class BooKService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getVerseByBooKAndChapterAndVerseNumber")
    public String getVerseByBooKAndChapterAndVerseNumber(@WebParam(name = "bookNumber")
    int bookNumber, @WebParam(name = "chapterNumber")
    int chapterNumber, @WebParam(name = "verseNumber")
    int verseNumber) {
        String verse = "";
        switch (bookNumber) {
            case 1:
                BGWS objBG = new BGWS();
                verse = objBG.bgOp(chapterNumber, verseNumber);
                break;
            case 2:
                BibleWS objBible = new BibleWS();
                verse = objBible.bibleOp(chapterNumber, verseNumber);
                break;
            default:
                verse = "Invalid Book";
                break;
        }
        return verse;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findBookNumber")
    public String findBookNumber() {
        return "For Book Selection: Bhag-Vad Gita as 1 and for Bible use 2";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllVerseByBookAndChapterNumber")
    public String getAllVerseByBookAndChapterNumber(@WebParam(name = "bookNumber")
    int bookNumber, @WebParam(name = "chapterNumber")
    int chapterNumber) {
        String verse = "";
        switch (bookNumber) {
            case 1:
                BGWS objBG = new BGWS();
                verse = objBG.bgAllVerse(chapterNumber);
                break;
            case 2:
                BibleWS objBible = new BibleWS();
                verse = objBible.bibleAllVerse(chapterNumber);
                break;

            default:
                verse = "Invalid Book";
                break;
        }
        return verse;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAbstractOfChapter")
    public String getAbstractOfChapter(@WebParam(name = "bookNumber")
    int bookNumber, @WebParam(name = "chapterNumber")
    int chapterNumber) {
       String abst = "";
        switch (bookNumber) {
            case 1:
                BGWS objBG = new BGWS();
                abst = objBG.bgOpAbst(chapterNumber);
                break;
            case 2:
                BibleWS objBible = new BibleWS();
                abst = objBible.bibleOpAbst(chapterNumber);
                break;

            default:
                abst = "Invalid Book";
                break;
        }
        return abst;
    }


}
