import pyautogui
import time
import argparse

def do_clicks(times: int, x_pos: int, y_pos: int) -> None:
    ''' 
    xdotool getmouselocation #get the desired mouse location with
    GRANT THIS SCRIPT X11 ACCESS
    xhost +local:  # Allow local connections to X server
    export DISPLAY=:0  # Explicitly set displ
    python3 automouseclick.py
    '''
    for i in range(times):
        # pyautogui.click(1822, 967)
        pyautogui.click(x=x_pos, y=y_pos)
        time.sleep(0.0001)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Automate mouse clicks.")
    parser.add_argument("-n", type=int, required=True, help="Number of times to click.")
    parser.add_argument("-xpos", type=int, required=True, help="The X position in the screen.")
    parser.add_argument("-ypos", type=int, required=True, help="The Y position in the screen.")
    args = parser.parse_args()
    do_clicks(args.n, args.xpos, args.ypos)
