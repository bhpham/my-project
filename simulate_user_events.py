import boto3
import json
import time
import random
import logging

# logging.basicConfig(level=logging.DEBUG)


# Initialize the Kinesis client
kinesis_client = boto3.client('kinesis', region_name='us-east-2')  # Replace 'your-region' with your AWS region

# List of event types
events = ['click', 'view', 'purchase']

max_events = 100  # Set the number of events to send
event_count = 0

while event_count < max_events:
    event = {
        'user_id': random.randint(1, 100),
        'event_type': random.choice(events),
        'timestamp': time.time()
    }
    response = kinesis_client.put_record(StreamName='user-events-stream', Data=json.dumps(event), PartitionKey=str(event['user_id']))
    print(f"Sent event: {event} with response: {response}")
    event_count += 1
    time.sleep(1)
