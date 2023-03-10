package com.light.hexo.common.event;

import com.light.hexo.common.component.event.BaseEvent;
import com.light.hexo.common.component.event.EventEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @Author MoonlightL
 * @ClassName: AlbumEvent
 * @ProjectName hexo-boot
 * @Description: 专辑事件
 * @DateTime 2021/12/23, 0023 18:10
 */
@Setter
@Getter
@Accessors(chain = true)
public class AlbumEvent extends BaseEvent {

    public AlbumEvent(Object source) {
        super(source);
    }

    @Override
    protected String getEventType() {
        return EventEnum.ALBUM.getType();
    }
}
