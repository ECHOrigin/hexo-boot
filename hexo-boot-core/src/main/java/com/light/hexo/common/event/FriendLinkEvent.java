package com.light.hexo.common.event;

import com.light.hexo.common.component.event.BaseEvent;
import com.light.hexo.common.component.event.EventEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @Author MoonlightL
 * @ClassName: FriendLinkEvent
 * @ProjectName hexo-boot
 * @Description: 友链事件
 * @DateTime 2021/9/18, 0018 10:20
 */
@Setter
@Getter
@Accessors(chain = true)
public class FriendLinkEvent extends BaseEvent {

    public FriendLinkEvent(Object source) {
        super(source);
    }

    @Override
    protected String getEventType() {
        return EventEnum.FRIEND_LINK.getType();
    }
}