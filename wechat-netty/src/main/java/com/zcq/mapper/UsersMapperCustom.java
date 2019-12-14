package com.zcq.mapper;


import com.zcq.pojo.Users;
import com.zcq.pojo.vo.FriendRequestVO;
import com.zcq.pojo.vo.MyFriendsVO;
import com.zcq.utils.MyMapper;

import java.util.List;

public interface UsersMapperCustom extends MyMapper<Users> {

    public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);

    public List<MyFriendsVO> queryMyFriends(String userId);

    public void batchUpdateMsgSigned(List<String> msgIdList);
}