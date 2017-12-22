Bugly集成demo

使用bugly集成android热修复，gradle的完整配置

bugly热修复流程：

1.先打基础包，先配置tinker-Id，基础包和补丁包不同，以versionCode为基础。gradle点击task任务栈。build->assembleRelease
2.打补丁包，修改baseApkDir，为上次基础包时间戳，修改tinker-id,点击tinker-support -> buildTinkerPatchRelease

3基础包在 build->bakApk->对应时间戳，补丁包在build->outputs->patch