package ex_22_ENUM;


    enum APIURLS{
        katalon("https://katalon.com"),
        google("https://google.com");

        private String chaia_URLS;
        APIURLS(String url) {
            this.chaia_URLS=url;
        }
        String getURLS()
        {
            return this.chaia_URLS;
        }
    }

