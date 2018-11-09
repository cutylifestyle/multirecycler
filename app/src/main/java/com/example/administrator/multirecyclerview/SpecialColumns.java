package com.example.administrator.multirecyclerview;

import java.util.List;

public class SpecialColumns extends HomeBaseEntity{

        private int ret;
        private String title;
        private boolean hasMore;
        private List<SpecialColunmnEntity> list;

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

        public boolean isHasMore() {
            return hasMore;
        }

        public void setHasMore(boolean hasMore) {
            this.hasMore = hasMore;
        }

        public List<SpecialColunmnEntity> getList() {
            return list;
        }

        public void setList(List<SpecialColunmnEntity> list) {
            this.list = list;
        }

        public static class SpecialColunmnEntity extends CommonBaseEntity{
            /**
             * columnType : 1
             * specialId : 1374
             * title : 十段只能躲在被子里听的相声
             * subtitle : 绝对犀利，绝对够味，十段劲爆相声，请戴上耳机收听
             * footnote : 10首声音
             * coverPath : http://fdfs.xmcdn.com/group34/M02/11/C2/wKgJYFnXPEPjxTrkAAGZTmW83VM855_mobile_small.jpg
             * contentType : 2
             */

            private int columnType;
            private int specialId;
            private String title;
            private String subtitle;
            private String footnote;
            private String coverPath;
            private String contentType;

            public int getColumnType() {
                return columnType;
            }

            public void setColumnType(int columnType) {
                this.columnType = columnType;
            }

            public int getSpecialId() {
                return specialId;
            }

            public void setSpecialId(int specialId) {
                this.specialId = specialId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getFootnote() {
                return footnote;
            }

            public void setFootnote(String footnote) {
                this.footnote = footnote;
            }

            public String getCoverPath() {
                return coverPath;
            }

            public void setCoverPath(String coverPath) {
                this.coverPath = coverPath;
            }

            public String getContentType() {
                return contentType;
            }

            public void setContentType(String contentType) {
                this.contentType = contentType;
            }

            @Override
            public String toString() {
                return "SpecialColunmnEntity{" +
                        "columnType=" + columnType +
                        ", specialId=" + specialId +
                        ", title='" + title + '\'' +
                        ", subtitle='" + subtitle + '\'' +
                        ", footnote='" + footnote + '\'' +
                        ", coverPath='" + coverPath + '\'' +
                        ", contentType='" + contentType + '\'' +
                        '}';
            }
        }

    @Override
    public String toString() {
        return "SpecialColumns{" +
                "ret=" + ret +
                ", title='" + title + '\'' +
                ", hasMore=" + hasMore +
                ", list=" + list +
                '}';
    }
}
