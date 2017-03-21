package Factory;

public class FactoryWriteReadUser {
	
	private final static String file="FILE";
	private final static String db="DB";
	
	public static WriteReadUser chooseMethod(String fileOrDB) {
		
		WriteReadUser ret = null;
		
		if (fileOrDB.equalsIgnoreCase(file)) {
			ret = new FileWriteReadUser();
		}
		
		if (fileOrDB.equalsIgnoreCase(db)) {
			ret = new DBWriteReadUser();
		}
		
		return ret;
	}

}
