package com.moussa.taskk;

import java.util.List;

public class GsonFormat {


    /**
     * cod : 200
     * message : 0.004
     * cnt : 38
     * list : [{"dt":1527314400,"main":{"temp":299.74,"temp_min":295.791,"temp_max":299.74,"pressure":1009.89,"sea_level":1023.23,"grnd_level":1009.89,"humidity":76,"temp_kf":3.95},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":8},"wind":{"speed":3.91,"deg":36.5081},"rain":{"3h":0.01},"sys":{"pod":"d"},"dt_txt":"2018-05-26 06:00:00"},{"dt":1527325200,"main":{"temp":305.76,"temp_min":302.794,"temp_max":305.76,"pressure":1009.2,"sea_level":1022.49,"grnd_level":1009.2,"humidity":42,"temp_kf":2.97},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.32,"deg":29.0017},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-26 09:00:00"},{"dt":1527336000,"main":{"temp":308.53,"temp_min":306.556,"temp_max":308.53,"pressure":1007.52,"sea_level":1020.85,"grnd_level":1007.52,"humidity":30,"temp_kf":1.98},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.05,"deg":348.502},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-26 12:00:00"},{"dt":1527346800,"main":{"temp":306.91,"temp_min":305.925,"temp_max":306.91,"pressure":1006.47,"sea_level":1019.74,"grnd_level":1006.47,"humidity":27,"temp_kf":0.99},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.07,"deg":335.509},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-26 15:00:00"},{"dt":1527357600,"main":{"temp":300.923,"temp_min":300.923,"temp_max":300.923,"pressure":1007.99,"sea_level":1021.32,"grnd_level":1007.99,"humidity":39,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":4.61,"deg":358.001},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-26 18:00:00"},{"dt":1527368400,"main":{"temp":296.9,"temp_min":296.9,"temp_max":296.9,"pressure":1009.87,"sea_level":1023.24,"grnd_level":1009.87,"humidity":55,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":4.66,"deg":17.5029},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-26 21:00:00"},{"dt":1527379200,"main":{"temp":293.378,"temp_min":293.378,"temp_max":293.378,"pressure":1009.66,"sea_level":1023.21,"grnd_level":1009.66,"humidity":75,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.61,"deg":35.506},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-27 00:00:00"},{"dt":1527390000,"main":{"temp":290.541,"temp_min":290.541,"temp_max":290.541,"pressure":1010.22,"sea_level":1023.78,"grnd_level":1010.22,"humidity":95,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.62,"deg":44.0018},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-27 03:00:00"},{"dt":1527400800,"main":{"temp":296.744,"temp_min":296.744,"temp_max":296.744,"pressure":1011.14,"sea_level":1024.64,"grnd_level":1011.14,"humidity":68,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.97,"deg":50},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-27 06:00:00"},{"dt":1527411600,"main":{"temp":303.498,"temp_min":303.498,"temp_max":303.498,"pressure":1010.82,"sea_level":1024.21,"grnd_level":1010.82,"humidity":36,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.86,"deg":11.5043},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-27 09:00:00"},{"dt":1527422400,"main":{"temp":306.359,"temp_min":306.359,"temp_max":306.359,"pressure":1008.98,"sea_level":1022.3,"grnd_level":1008.98,"humidity":26,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.84,"deg":284.008},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-27 12:00:00"},{"dt":1527433200,"main":{"temp":305.743,"temp_min":305.743,"temp_max":305.743,"pressure":1007.89,"sea_level":1021.21,"grnd_level":1007.89,"humidity":23,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.63,"deg":292},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-27 15:00:00"},{"dt":1527444000,"main":{"temp":300.882,"temp_min":300.882,"temp_max":300.882,"pressure":1009.28,"sea_level":1022.55,"grnd_level":1009.28,"humidity":33,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":20},"wind":{"speed":3.63,"deg":332.502},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-27 18:00:00"},{"dt":1527454800,"main":{"temp":297.554,"temp_min":297.554,"temp_max":297.554,"pressure":1010.84,"sea_level":1024.21,"grnd_level":1010.84,"humidity":50,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":4.6,"deg":351.501},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-27 21:00:00"},{"dt":1527465600,"main":{"temp":294.138,"temp_min":294.138,"temp_max":294.138,"pressure":1011.1,"sea_level":1024.57,"grnd_level":1011.1,"humidity":70,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":3.62,"deg":9.50607},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-28 00:00:00"},{"dt":1527476400,"main":{"temp":291.836,"temp_min":291.836,"temp_max":291.836,"pressure":1011.43,"sea_level":1024.9,"grnd_level":1011.43,"humidity":87,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.21,"deg":36.5047},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-28 03:00:00"},{"dt":1527487200,"main":{"temp":297.447,"temp_min":297.447,"temp_max":297.447,"pressure":1012.13,"sea_level":1025.56,"grnd_level":1012.13,"humidity":64,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.38,"deg":41.0048},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-28 06:00:00"},{"dt":1527498000,"main":{"temp":303.443,"temp_min":303.443,"temp_max":303.443,"pressure":1011.57,"sea_level":1025.05,"grnd_level":1011.57,"humidity":39,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.11,"deg":350.504},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-28 09:00:00"},{"dt":1527508800,"main":{"temp":305.884,"temp_min":305.884,"temp_max":305.884,"pressure":1009.62,"sea_level":1022.96,"grnd_level":1009.62,"humidity":29,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.65,"deg":305.501},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-28 12:00:00"},{"dt":1527519600,"main":{"temp":305.242,"temp_min":305.242,"temp_max":305.242,"pressure":1008.65,"sea_level":1021.93,"grnd_level":1008.65,"humidity":25,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.4,"deg":314.504},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-28 15:00:00"},{"dt":1527530400,"main":{"temp":300.525,"temp_min":300.525,"temp_max":300.525,"pressure":1009.93,"sea_level":1023.28,"grnd_level":1009.93,"humidity":37,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":4.56,"deg":335.003},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-28 18:00:00"},{"dt":1527541200,"main":{"temp":296.685,"temp_min":296.685,"temp_max":296.685,"pressure":1011.4,"sea_level":1024.88,"grnd_level":1011.4,"humidity":54,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":4.38,"deg":341.501},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-28 21:00:00"},{"dt":1527552000,"main":{"temp":293.189,"temp_min":293.189,"temp_max":293.189,"pressure":1011.68,"sea_level":1025.17,"grnd_level":1011.68,"humidity":76,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.81,"deg":357.502},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-29 00:00:00"},{"dt":1527562800,"main":{"temp":290.474,"temp_min":290.474,"temp_max":290.474,"pressure":1011.7,"sea_level":1025.3,"grnd_level":1011.7,"humidity":95,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.45,"deg":355.001},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-29 03:00:00"},{"dt":1527573600,"main":{"temp":295.705,"temp_min":295.705,"temp_max":295.705,"pressure":1012.15,"sea_level":1025.6,"grnd_level":1012.15,"humidity":71,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.98,"deg":10.0114},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-29 06:00:00"},{"dt":1527584400,"main":{"temp":301.649,"temp_min":301.649,"temp_max":301.649,"pressure":1011.66,"sea_level":1024.97,"grnd_level":1011.66,"humidity":40,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.31,"deg":338.502},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-29 09:00:00"},{"dt":1527595200,"main":{"temp":304.807,"temp_min":304.807,"temp_max":304.807,"pressure":1009.65,"sea_level":1023,"grnd_level":1009.65,"humidity":28,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.17,"deg":329.001},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-29 12:00:00"},{"dt":1527606000,"main":{"temp":304.095,"temp_min":304.095,"temp_max":304.095,"pressure":1008.75,"sea_level":1022.11,"grnd_level":1008.75,"humidity":30,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":12},"wind":{"speed":3.82,"deg":332.505},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-29 15:00:00"},{"dt":1527616800,"main":{"temp":300.574,"temp_min":300.574,"temp_max":300.574,"pressure":1009.95,"sea_level":1023.19,"grnd_level":1009.95,"humidity":42,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":56},"wind":{"speed":3.82,"deg":341.001},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-29 18:00:00"},{"dt":1527627600,"main":{"temp":296.623,"temp_min":296.623,"temp_max":296.623,"pressure":1011.18,"sea_level":1024.57,"grnd_level":1011.18,"humidity":59,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":3.96,"deg":351.001},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-29 21:00:00"},{"dt":1527638400,"main":{"temp":293.346,"temp_min":293.346,"temp_max":293.346,"pressure":1011,"sea_level":1024.49,"grnd_level":1011,"humidity":80,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.29,"deg":359.002},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-30 00:00:00"},{"dt":1527649200,"main":{"temp":290.448,"temp_min":290.448,"temp_max":290.448,"pressure":1011.12,"sea_level":1024.69,"grnd_level":1011.12,"humidity":95,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.32,"deg":359.507},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-30 03:00:00"},{"dt":1527660000,"main":{"temp":296.284,"temp_min":296.284,"temp_max":296.284,"pressure":1012.06,"sea_level":1025.53,"grnd_level":1012.06,"humidity":71,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":20},"wind":{"speed":1.91,"deg":3.00027},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-30 06:00:00"},{"dt":1527670800,"main":{"temp":301.797,"temp_min":301.797,"temp_max":301.797,"pressure":1011.94,"sea_level":1025.33,"grnd_level":1011.94,"humidity":45,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.12,"deg":327.505},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-30 09:00:00"},{"dt":1527681600,"main":{"temp":305.256,"temp_min":305.256,"temp_max":305.256,"pressure":1010.5,"sea_level":1023.84,"grnd_level":1010.5,"humidity":31,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.19,"deg":317.505},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-30 12:00:00"},{"dt":1527692400,"main":{"temp":304.701,"temp_min":304.701,"temp_max":304.701,"pressure":1009.93,"sea_level":1023.2,"grnd_level":1009.93,"humidity":29,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.57,"deg":332.002},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-05-30 15:00:00"},{"dt":1527703200,"main":{"temp":300.345,"temp_min":300.345,"temp_max":300.345,"pressure":1011.22,"sea_level":1024.49,"grnd_level":1011.22,"humidity":40,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":3.83,"deg":350.502},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-30 18:00:00"},{"dt":1527714000,"main":{"temp":296.543,"temp_min":296.543,"temp_max":296.543,"pressure":1012.84,"sea_level":1026.25,"grnd_level":1012.84,"humidity":56,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":4.06,"deg":353.506},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-05-30 21:00:00"}]
     * city : {"id":360630,"name":"Cairo","coord":{"lat":30.0626,"lon":31.2497},"country":"EG"}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityBean city;
    private java.util.List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return (List<ListBean>) list;
    }

    public void setList(List<ListBean> list) {
        this.list = (java.util.List<ListBean>) list;
    }

    public static class CityBean {
        /**
         * id : 360630
         * name : Cairo
         * coord : {"lat":30.0626,"lon":31.2497}
         * country : EG
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public static class CoordBean {
            /**
             * lat : 30.0626
             * lon : 31.2497
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1527314400
         * main : {"temp":299.74,"temp_min":295.791,"temp_max":299.74,"pressure":1009.89,"sea_level":1023.23,"grnd_level":1009.89,"humidity":76,"temp_kf":3.95}
         * weather : [{"id":500,"main":"Rain","description":"light rain","icon":"10d"}]
         * clouds : {"all":8}
         * wind : {"speed":3.91,"deg":36.5081}
         * rain : {"3h":0.01}
         * sys : {"pod":"d"}
         * dt_txt : 2018-05-26 06:00:00
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private RainBean rain;
        private SysBean sys;
        private String dt_txt;
        private java.util.List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public List<WeatherBean> getWeather() {
            return (List<WeatherBean>) weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = (java.util.List<WeatherBean>) weather;
        }

        public static class MainBean {
            /**
             * temp : 299.74
             * temp_min : 295.791
             * temp_max : 299.74
             * pressure : 1009.89
             * sea_level : 1023.23
             * grnd_level : 1009.89
             * humidity : 76
             * temp_kf : 3.95
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 8
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
            /**
             * speed : 3.91
             * deg : 36.5081
             */

            private double speed;
            private double deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public double getDeg() {
                return deg;
            }

            public void setDeg(double deg) {
                this.deg = deg;
            }
        }

        public static class RainBean {
            /**
             * 3h : 0.01
             */

            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class SysBean {
            /**
             * pod : d
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class WeatherBean {
            /**
             * id : 500
             * main : Rain
             * description : light rain
             * icon : 10d
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
