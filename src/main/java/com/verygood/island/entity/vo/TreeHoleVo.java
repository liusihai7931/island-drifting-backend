package com.verygood.island.entity.vo;

import com.verygood.island.entity.TreeHole;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/5/22 19:48
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TreeHoleVo implements Serializable {


    private TreeHole hole;


    private String nickname;

    /*
     *树洞下的留言内容
     */
    private List<MessageVo> messages;

}
