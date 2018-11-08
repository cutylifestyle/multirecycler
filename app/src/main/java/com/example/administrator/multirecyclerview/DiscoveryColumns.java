package com.example.administrator.multirecyclerview;

import java.util.List;

public class DiscoveryColumns extends HomeBaseEntity{

        private int ret;
        private String title;
        private int locationInHotRecommend;
        private List<DiscoveryColumnEntity> list;

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

        public int getLocationInHotRecommend() {
            return locationInHotRecommend;
        }

        public void setLocationInHotRecommend(int locationInHotRecommend) {
            this.locationInHotRecommend = locationInHotRecommend;
        }

        public List<DiscoveryColumnEntity> getList() {
            return list;
        }

        public void setList(List<DiscoveryColumnEntity> list) {
            this.list = list;
        }

        public static class DiscoveryColumnEntity {
            /**
             * id : 80581
             * title : 今日最火
             * subtitle :
             * coverPath : http://fdfs.xmcdn.com/group6/M0B/9E/09/wKgDg1dedqyStSJiAABQ5aLcVZk175.jpg
             * contentType : ranking_list
             * url :
             * sharePic :
             * enableShare : false
             * isExternalUrl : false
             * contentUpdatedAt : 0
             * displayClass : one_line
             * properties : {"contentType":"track","rankingListId":57,"isPaid":false,"key":"ranking:track:scoreByTime:1:0"}
             * bubbleText :
             * isHot : true
             */

            private int id;
            private String title;
            private String subtitle;
            private String coverPath;
            private String contentType;
            private String url;
            private String sharePic;
            private boolean enableShare;
            private boolean isExternalUrl;
            private int contentUpdatedAt;
            private String displayClass;
            private PropertiesBean properties;
            private String bubbleText;
            private boolean isHot;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
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

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getSharePic() {
                return sharePic;
            }

            public void setSharePic(String sharePic) {
                this.sharePic = sharePic;
            }

            public boolean isEnableShare() {
                return enableShare;
            }

            public void setEnableShare(boolean enableShare) {
                this.enableShare = enableShare;
            }

            public boolean isIsExternalUrl() {
                return isExternalUrl;
            }

            public void setIsExternalUrl(boolean isExternalUrl) {
                this.isExternalUrl = isExternalUrl;
            }

            public int getContentUpdatedAt() {
                return contentUpdatedAt;
            }

            public void setContentUpdatedAt(int contentUpdatedAt) {
                this.contentUpdatedAt = contentUpdatedAt;
            }

            public String getDisplayClass() {
                return displayClass;
            }

            public void setDisplayClass(String displayClass) {
                this.displayClass = displayClass;
            }

            public PropertiesBean getProperties() {
                return properties;
            }

            public void setProperties(PropertiesBean properties) {
                this.properties = properties;
            }

            public String getBubbleText() {
                return bubbleText;
            }

            public void setBubbleText(String bubbleText) {
                this.bubbleText = bubbleText;
            }

            public boolean isIsHot() {
                return isHot;
            }

            public void setIsHot(boolean isHot) {
                this.isHot = isHot;
            }

            @Override
            public String toString() {
                return "DiscoveryColumnEntity{" +
                        "id=" + id +
                        ", title='" + title + '\'' +
                        ", subtitle='" + subtitle + '\'' +
                        ", coverPath='" + coverPath + '\'' +
                        ", contentType='" + contentType + '\'' +
                        ", url='" + url + '\'' +
                        ", sharePic='" + sharePic + '\'' +
                        ", enableShare=" + enableShare +
                        ", isExternalUrl=" + isExternalUrl +
                        ", contentUpdatedAt=" + contentUpdatedAt +
                        ", displayClass='" + displayClass + '\'' +
                        ", properties=" + properties +
                        ", bubbleText='" + bubbleText + '\'' +
                        ", isHot=" + isHot +
                        '}';
            }

            public static class PropertiesBean {
                /**
                 * contentType : track
                 * rankingListId : 57
                 * isPaid : false
                 * key : ranking:track:scoreByTime:1:0
                 */

                private String contentType;
                private int rankingListId;
                private boolean isPaid;
                private String key;

                public String getContentType() {
                    return contentType;
                }

                public void setContentType(String contentType) {
                    this.contentType = contentType;
                }

                public int getRankingListId() {
                    return rankingListId;
                }

                public void setRankingListId(int rankingListId) {
                    this.rankingListId = rankingListId;
                }

                public boolean isIsPaid() {
                    return isPaid;
                }

                public void setIsPaid(boolean isPaid) {
                    this.isPaid = isPaid;
                }

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }


                @Override
                public String toString() {
                    return "PropertiesBean{" +
                            "contentType='" + contentType + '\'' +
                            ", rankingListId=" + rankingListId +
                            ", isPaid=" + isPaid +
                            ", key='" + key + '\'' +
                            '}';
                }
            }
        }

    @Override
    public String toString() {
        return "DiscoveryColumns{" +
                "ret=" + ret +
                ", title='" + title + '\'' +
                ", locationInHotRecommend=" + locationInHotRecommend +
                ", list=" + list +
                '}';
    }
}
