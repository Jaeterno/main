package com.jaeterno;

public class Reference {

	public static final String MOD_ID = "jtm";
	public static final String NAME = "Jaeterno's Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.12]";
	
	public static final String CLIENT_PROXY_CLASS = "com.jaeterno.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.jaeterno.proxy.ServerProxy";
	
	public static enum TutorialItems {
		BRODOMETALINGOT("brodometalingot", "ItemBrodometalIngot");
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;	
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName( ) {
			return registryName;
		}
	}
	
	public static enum TutorialBlocks {
		BRODOMETALBLOCK("brodometalblock", "BlockBrodometal");
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;	
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName( ) {
			return registryName;
		}
	}
}
