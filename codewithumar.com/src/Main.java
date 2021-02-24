public class Main {

	public static void main(String[] args) {
		String fileName_ext = "carrierUserOutreach_ES_12f470_02052021_v1_1-1.csv.pgp.process";
		String fileName = fileName_ext.contains(".") ? fileName_ext.split("\\.")[0] : fileName_ext;
		String decPlainTextFile = fileName + ".cvs";
		System.out.println(decPlainTextFile);
		
		StringBuilder sub_ids = new StringBuilder();
		String ban="";
		sub_ids.append(ban + ",");
		System.out.println("sub_id after append :" + sub_ids);

		if (ban.length() > 0){
			String subIdsData = new String(sub_ids.deleteCharAt(sub_ids.length() - 1));
			System.out.println(subIdsData);
		}
		else {
			throw new NullPointerException();
		}

	}

}
