package test;

import javax.ejb.Remote;

import entity.Conference;

@Remote
public interface PepcokWSTests {

	public String PutConferencesToDB();
	public Conference getConferenceFromDB(String id);
	public Conference testGettingConferenceFromDB(int id);
	public String testGettingConferenceWithStringResponse(int id);
}

