package de.steinberg.rpc.execution.trigger.core.engine;

import lombok.Data;

/**
 * Created by lkleen on 11/29/2016.
 */
@Data
public abstract class AbstractAction implements Action {

    protected Settings settings = new Settings();
    protected Controls controls = new Controls();

}
