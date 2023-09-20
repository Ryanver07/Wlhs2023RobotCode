**Wilde Lake High School Robotics Code Change Log**
**Version 0.09**
Last Tested: Never

Changes Include:
1. Removed Hardware Class
2. Added resetRuntime(); to both remaining classes
3. Added Hardware Mapping to both remaining classes

Removing the hardware class will remove a possible point of error.

**Version 0.08**
Last Tested: 9-20-2023
Test Ouput: Reliable Control App Crash

Changes Include:
1. Removing BasicCode Class
2. Adding DualMotorMode Class & FourMotorMode Class
3. Renamed "readme.md" to "ChangeLog.md"

DualMotorMode Class: Exact Same as FourMotorModeClass with the exeption of 2 lines of code removed
and small edit to @TeleOp.

FourMotorMode is identical to BasicCode with a small change of declaring the class as
"FourMotorMode" instead of "BasicCode".

**Version 0.07**
Last Tested: Never

Changes Include:
1. Re-writing readme.md
2. Creating hardware mapping class so that auto mode and manual mode can be more easily coded while.
3. Re-writing BasicCode class in a way that utilizes the hardware class.
4. Updating @TeleOp in BasicCode
4. Deleting AutoMode.java to help minimize errors. (Auto Mode will come back)
