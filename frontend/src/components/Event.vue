<template>
  <div class="container">
    <h1 class="text-center">Event List</h1>
    <table class="table table-striped">
      <thead>
        <tr>
          <th>Event Id</th>
          <th>Event Name</th>
          <th>Event Location</th>
          <th>Email</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="event in events" :key="event.id">
          <td>{{ event.id }}</td>
          <td>{{ event.eventName }}</td>
          <td>{{ event.location }}</td>
          <td>{{ event.email }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import EventService from '@/services/EventService';

export default {
  name: 'Events',
  data() {
    return {
      events: []
    };
  },
  methods: {
    getEvents() {
      EventService.getEvents()
        .then(response => {
          this.events = response.data;
        })
        .catch(error => {
          console.error('Failed to fetch events:', error);
        });
    }
  },
  created() {
    this.getEvents();
  }
};
</script>
