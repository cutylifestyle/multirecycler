package com.example.administrator.multirecyclerview;

import java.util.List;

public class EditorRecommendAlbums extends HomeBaseEntity{


        private int ret;
        private String title;
        private boolean hasMore;
        private List<EditorRecommendAlbumsEntity> list;

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

        public List<EditorRecommendAlbumsEntity> getList() {
            return list;
        }

        public void setList(List<EditorRecommendAlbumsEntity> list) {
            this.list = list;
        }

        public static class EditorRecommendAlbumsEntity {
            /**
             * id : 15161417
             * albumId : 15161417
             * uid : 51763868
             * intro : 唱完之后再朗诵，易学易记
             * nickname : 宝宝巴士
             * albumCoverUrl290 : http://imagev2.xmcdn.com/group41/M09/E5/43/wKgJ8lrhc9XxgBV-AAQedOYe1uU083.jpg!op_type=5&upload_type=album&device_type=ios&name=medium
             * coverSmall : http://imagev2.xmcdn.com/group41/M09/E5/43/wKgJ8lrhc9XxgBV-AAQedOYe1uU083.jpg!op_type=5&upload_type=album&device_type=ios&name=small
             * coverMiddle : http://imagev2.xmcdn.com/group41/M09/E5/43/wKgJ8lrhc9XxgBV-AAQedOYe1uU083.jpg!op_type=5&upload_type=album&device_type=ios&name=medium
             * coverLarge : http://imagev2.xmcdn.com/group41/M09/E5/43/wKgJ8lrhc9XxgBV-AAQedOYe1uU083.jpg!op_type=5&upload_type=album&device_type=ios&name=large
             * title : 宝宝巴士国学 · 奇妙三字经
             * tags : 三字经儿童版,儿童三字经
             * tracks : 37
             * playsCounts : 7388810
             * isFinished : 1
             * serialState : 1
             * trackId : 0
             * trackTitle : 唱完之后再朗诵，易学易记
             * provider : search
             * isPaid : false
             * commentsCount : 0
             * priceTypeId : 0
             * refundSupportType : 0
             * isVipFree : false
             * isDraft : false
             */

            private int id;
            private int albumId;
            private int uid;
            private String intro;
            private String nickname;
            private String albumCoverUrl290;
            private String coverSmall;
            private String coverMiddle;
            private String coverLarge;
            private String title;
            private String tags;
            private int tracks;
            private int playsCounts;
            private int isFinished;
            private int serialState;
            private int trackId;
            private String trackTitle;
            private String provider;
            private boolean isPaid;
            private int commentsCount;
            private int priceTypeId;
            private int refundSupportType;
            private boolean isVipFree;
            private boolean isDraft;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getAlbumId() {
                return albumId;
            }

            public void setAlbumId(int albumId) {
                this.albumId = albumId;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getAlbumCoverUrl290() {
                return albumCoverUrl290;
            }

            public void setAlbumCoverUrl290(String albumCoverUrl290) {
                this.albumCoverUrl290 = albumCoverUrl290;
            }

            public String getCoverSmall() {
                return coverSmall;
            }

            public void setCoverSmall(String coverSmall) {
                this.coverSmall = coverSmall;
            }

            public String getCoverMiddle() {
                return coverMiddle;
            }

            public void setCoverMiddle(String coverMiddle) {
                this.coverMiddle = coverMiddle;
            }

            public String getCoverLarge() {
                return coverLarge;
            }

            public void setCoverLarge(String coverLarge) {
                this.coverLarge = coverLarge;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTags() {
                return tags;
            }

            public void setTags(String tags) {
                this.tags = tags;
            }

            public int getTracks() {
                return tracks;
            }

            public void setTracks(int tracks) {
                this.tracks = tracks;
            }

            public int getPlaysCounts() {
                return playsCounts;
            }

            public void setPlaysCounts(int playsCounts) {
                this.playsCounts = playsCounts;
            }

            public int getIsFinished() {
                return isFinished;
            }

            public void setIsFinished(int isFinished) {
                this.isFinished = isFinished;
            }

            public int getSerialState() {
                return serialState;
            }

            public void setSerialState(int serialState) {
                this.serialState = serialState;
            }

            public int getTrackId() {
                return trackId;
            }

            public void setTrackId(int trackId) {
                this.trackId = trackId;
            }

            public String getTrackTitle() {
                return trackTitle;
            }

            public void setTrackTitle(String trackTitle) {
                this.trackTitle = trackTitle;
            }

            public String getProvider() {
                return provider;
            }

            public void setProvider(String provider) {
                this.provider = provider;
            }

            public boolean isIsPaid() {
                return isPaid;
            }

            public void setIsPaid(boolean isPaid) {
                this.isPaid = isPaid;
            }

            public int getCommentsCount() {
                return commentsCount;
            }

            public void setCommentsCount(int commentsCount) {
                this.commentsCount = commentsCount;
            }

            public int getPriceTypeId() {
                return priceTypeId;
            }

            public void setPriceTypeId(int priceTypeId) {
                this.priceTypeId = priceTypeId;
            }

            public int getRefundSupportType() {
                return refundSupportType;
            }

            public void setRefundSupportType(int refundSupportType) {
                this.refundSupportType = refundSupportType;
            }

            public boolean isIsVipFree() {
                return isVipFree;
            }

            public void setIsVipFree(boolean isVipFree) {
                this.isVipFree = isVipFree;
            }

            public boolean isIsDraft() {
                return isDraft;
            }

            public void setIsDraft(boolean isDraft) {
                this.isDraft = isDraft;
            }

            @Override
            public String toString() {
                return "EditorRecommendAlbumsEntity{" +
                        "id=" + id +
                        ", albumId=" + albumId +
                        ", uid=" + uid +
                        ", intro='" + intro + '\'' +
                        ", nickname='" + nickname + '\'' +
                        ", albumCoverUrl290='" + albumCoverUrl290 + '\'' +
                        ", coverSmall='" + coverSmall + '\'' +
                        ", coverMiddle='" + coverMiddle + '\'' +
                        ", coverLarge='" + coverLarge + '\'' +
                        ", title='" + title + '\'' +
                        ", tags='" + tags + '\'' +
                        ", tracks=" + tracks +
                        ", playsCounts=" + playsCounts +
                        ", isFinished=" + isFinished +
                        ", serialState=" + serialState +
                        ", trackId=" + trackId +
                        ", trackTitle='" + trackTitle + '\'' +
                        ", provider='" + provider + '\'' +
                        ", isPaid=" + isPaid +
                        ", commentsCount=" + commentsCount +
                        ", priceTypeId=" + priceTypeId +
                        ", refundSupportType=" + refundSupportType +
                        ", isVipFree=" + isVipFree +
                        ", isDraft=" + isDraft +
                        '}';
            }
        }

    @Override
    public String toString() {
        return "EditorRecommendAlbums{" +
                "ret=" + ret +
                ", title='" + title + '\'' +
                ", hasMore=" + hasMore +
                ", list=" + list +
                '}';
    }
}
