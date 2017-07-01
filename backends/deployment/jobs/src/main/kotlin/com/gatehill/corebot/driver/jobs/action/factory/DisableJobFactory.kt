package com.gatehill.corebot.driver.jobs.action.factory

import com.gatehill.corebot.action.factory.ActionMessageMode
import com.gatehill.corebot.action.factory.NamedActionFactory
import com.gatehill.corebot.action.factory.Template
import com.gatehill.corebot.action.model.ActionType
import com.gatehill.corebot.config.ConfigService
import javax.inject.Inject

/**
 * Disables a job.
 */
@Template("disableJob")
class DisableJobFactory @Inject constructor(configService: ConfigService) : NamedActionFactory(configService) {
    override val actionType: ActionType = JobActionType.DISABLE
    override val actionMessageMode = ActionMessageMode.INDIVIDUAL
}
