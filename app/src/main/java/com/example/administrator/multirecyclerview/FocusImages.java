package com.example.administrator.multirecyclerview;

import java.util.List;

public class FocusImages extends HomeBaseEntity{

        private int ret;
        private String title;
        private List<FocusImageEntity> list;

        public int getRet() {
            return ret;
        }

        public void setRet(int ret) {
            this.ret = ret;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<FocusImageEntity> getList() {
            return list;
        }

        public void setList(List<FocusImageEntity> list) {
            this.list = list;
        }

        public static class FocusImageEntity {
            /**
             * id : 20077
             * shortTitle : 新手听单-最热门
             * longTitle : 新手听单-最热门
             * pic : http://fdfs.xmcdn.com/group36/M0B/D9/6A/wKgJUlpCItTjASLjAAFoEwpEI48283_android_large.png
             * type : 9
             * specialId : 1283
             * subType : 1
             * isShare : true
             * is_External_url : false
             * focusCurrentId : 126084
             * roomId : 0
             */

            private int id;
            private String shortTitle;
            private String longTitle;
            private String pic;
            private int type;
            private int specialId;
            private int subType;
            private boolean isShare;
            private boolean is_External_url;
            private int focusCurrentId;
            private int roomId;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getShortTitle() {
                return shortTitle;
            }

            public void setShortTitle(String shortTitle) {
                this.shortTitle = shortTitle;
            }

            public String getLongTitle() {
                return longTitle;
            }

            public void setLongTitle(String longTitle) {
                this.longTitle = longTitle;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getSpecialId() {
                return specialId;
            }

            public void setSpecialId(int specialId) {
                this.specialId = specialId;
            }

            public int getSubType() {
                return subType;
            }

            public void setSubType(int subType) {
                this.subType = subType;
            }

            public boolean isIsShare() {
                return isShare;
            }

            public void setIsShare(boolean isShare) {
                this.isShare = isShare;
            }

            public boolean isIs_External_url() {
                return is_External_url;
            }

            public void setIs_External_url(boolean is_External_url) {
                this.is_External_url = is_External_url;
            }

            public int getFocusCurrentId() {
                return focusCurrentId;
            }

            public void setFocusCurrentId(int focusCurrentId) {
                this.focusCurrentId = focusCurrentId;
            }

            public int getRoomId() {
                return roomId;
            }

            public void setRoomId(int roomId) {
                this.roomId = roomId;
            }

            @Override
            public String toString() {
                return "FocusImageEntity{" +
                        "id=" + id +
                        ", shortTitle='" + shortTitle + '\'' +
                        ", longTitle='" + longTitle + '\'' +
                        ", pic='" + pic + '\'' +
                        ", type=" + type +
                        ", specialId=" + specialId +
                        ", subType=" + subType +
                        ", isShare=" + isShare +
                        ", is_External_url=" + is_External_url +
                        ", focusCurrentId=" + focusCurrentId +
                        ", roomId=" + roomId +
                        '}';
            }
        }

    @Override
    public String toString() {
        return "FocusImages{" +
                "ret=" + ret +
                ", title='" + title + '\'' +
                ", list=" + list +
                '}';
    }
}
